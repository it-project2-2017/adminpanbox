package beans;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.HashMap;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.client.ClientConfig;
//import org.glassfish.jersey.media.multipart.FormDataMultiPart;
//import org.glassfish.jersey.media.multipart.MultiPartFeature;
//import org.glassfish.jersey.media.multipart.file.FileDataBodyPart;;

/**
 *
 * @author gina PC
 */
public class WSClient {
    private Client client;
    private String RS_URL = "http://localhost:8080/PanBox-1.0/webresources/panbox";
    
    public void init() {
        ClientConfig cf = new ClientConfig();
        cf.register(JsonMoxyConfigurationContextResolver.class);
        client = ClientBuilder.newClient(cf);
    }
    
    public static void main(String[] args) {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
    
    public ArrayList<LedgerRecord> getLedger( int id ){
        Ledger list = client.target(RS_URL)
                .path("/ledgerrecord/" + id)
                .request(MediaType.APPLICATION_JSON)
                .get(Ledger.class);
        ArrayList<LedgerRecord> ledger = list.getList();
        return ledger;
    }

    public void addLedgerRecord(LedgerRecord lr){
        LedgerRecord record = client.target(RS_URL)
                .path("/addledgerrecord")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(lr, MediaType.APPLICATION_XML), LedgerRecord.class);
    }    
        
        
    public Integer stockFinder( String name, ArrayList<Stock> stocks ){
        int count = 0;
        int stockNo = 0;
        boolean condition = false;
        while(condition!=true){
            if(name.equals(stocks.get(count).getStockName())){
                condition = true;
            }
            count++;
        }
        return count;
    }
    
    public ArrayList<StckParticularPurOrd> getStckParticularPurOrd( int id ){
        StckParticularPurOrdList list = client.target(RS_URL)
                .path("/stckparticularpurord/" + String.valueOf(id) )
                .request(MediaType.APPLICATION_JSON)
                .get(StckParticularPurOrdList.class);
        ArrayList<StckParticularPurOrd> sppList = list.getList();
        return sppList;
    }

    public void returnStock( ReturnStock retstck ){
        ReturnStock rs = client.target(RS_URL)
                .path("/returnStckparticular")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(retstck, MediaType.APPLICATION_XML), ReturnStock.class);
    }
    
    public ArrayList<ReturnStock> getRSList( int poid ){
        ReturnStockList list = client.target(RS_URL)
                .path("/rsrecord/" + String.valueOf(poid) )
                .request(MediaType.APPLICATION_JSON)
                .get(ReturnStockList.class);
        ArrayList<ReturnStock> restckrecord = list.getList();
        return restckrecord;
    }
    
    public Stock updateStckQty( int stckid, double qty, String op ){
        Form f = new Form();    
        f.param("stckid", String.valueOf(stckid));
        f.param("qty", String.valueOf(qty));
        f.param("op", op );
        Stock stock = client.target(RS_URL)
                .path("/updateStckQty")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(f, MediaType.APPLICATION_FORM_URLENCODED), Stock.class);
        return stock;
    }
    
    public void updateStckParticularPurOrd(StckParticularPurOrd spp){
        String stckparticular = client.target(RS_URL)
                .path("/updateStckParticularPurOrd")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(spp, MediaType.APPLICATION_XML), String.class);
    }
    
    public void updatePurchaseOrder(int poid){
        PurchaseOrder po = client.target(RS_URL)
                .path("/updatePurOrd/" + String.valueOf(poid))
                .request(MediaType.APPLICATION_JSON)
                .get(PurchaseOrder.class);
    }
    
    public Stock getStock( String sname ){
        Stock stock = client.target(RS_URL)
                .path("/stock/"+ sname)
                .request(MediaType.APPLICATION_JSON)
                .get(Stock.class);
        return stock;
    }
    /*
    public ArrayList<PurchaseOrder> getPoList( int id ){
        PurchaseOrderList list = client.target(RS_URL)
                .path("/purchaseOrder/"+ String.valueOf(id))
                .request(MediaType.APPLICATION_JSON)
                .get(PurchaseOrderList.class);
        ArrayList<PurchaseOrder> poList = list.getList();
        return poList;
    }
    */        
    public int getSupp( String name ){
        Supplier supplier = client.target(RS_URL)
                .path("/supplier/"+ name)
                .request(MediaType.APPLICATION_JSON)
                .get(Supplier.class);
        return supplier.getId();
    }
    
    public ArrayList<StckParticular> getStckParticular( String supname ){
        StckParticularList spList = client.target(RS_URL)
                .path("/stckparticulars/"+ supname)
                .request(MediaType.APPLICATION_JSON)
                .get(StckParticularList.class);
        ArrayList<StckParticular> list = spList.getList();
        return list;
    }
    
    public StckParticular getStckParticularFromName( String particularname ){
        StckParticular sp = client.target(RS_URL)
                .path("/stckparticular/" + particularname )
                .request(MediaType.APPLICATION_JSON)
                .get(StckParticular.class);
        return sp;
    }
    
    public void addstckparticularord( StckParticularPurOrd sppo ){
        StckParticularPurOrd stckparticular = client.target(RS_URL)
                .path("/addstckparticularpurord")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(sppo, MediaType.APPLICATION_XML), StckParticularPurOrd.class);
    }
    
    public void addreturnstock( ReturnStock retstck ){
        ReturnStock rs = client.target(RS_URL)
                .path("/addspreturn")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(retstck, MediaType.APPLICATION_XML), ReturnStock.class);
    }
    
    public ArrayList<Employee> getEmployeeList(){
        EmployeeList sp = client.target(RS_URL)
                .path("/employees" )
                .request(MediaType.APPLICATION_JSON)
                .get(EmployeeList.class);
        ArrayList<Employee> list = sp.getList();
        return list;
    }
    
    public Employee getEmployee(String empname){
        Employee employee = client.target(RS_URL)
                .path("/employee/" + empname )
                .request(MediaType.APPLICATION_JSON)
                .get(Employee.class);
        return employee;
    }
    
    public int addPurOrd( String datetime ){
        PurchaseOrder spo = client.target(RS_URL)
                .path("/addpurchaseorder")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(datetime, MediaType.APPLICATION_XML), PurchaseOrder.class);
        return spo.getPoid();
    }
    
    public void updateStckPurOrd( StckPurOrd spo ){
        StckPurOrd stckpurord = client.target(RS_URL)
                .path("/updateStckPurOrd")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(spo, MediaType.APPLICATION_XML), StckPurOrd.class);
    }
    
    public void addStckPurOrd( StckPurOrd spo ){
        StckPurOrd stckpurord = client.target(RS_URL)
                .path("/addstckpurord")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(spo, MediaType.APPLICATION_XML), StckPurOrd.class);
        //System.out.println(stckpurord.getPoid());
    }
    
    public ArrayList<PurchaseOrder> getPurchaseOrderList(){
        PurchaseOrderList list = client.target(RS_URL)
                .path("/purchaseorders")
                .request(MediaType.APPLICATION_JSON)
                .get(PurchaseOrderList.class);
        ArrayList<PurchaseOrder> poList = list.getList();
        return poList;
    }

    public ArrayList<Transaction> purchaseOrderList(int prodid){
        TransactionList list = client.target(RS_URL)
                .path("/orderhistory/"+ String.valueOf(prodid))
                .request(MediaType.APPLICATION_JSON)
                .get(TransactionList.class);
        ArrayList<Transaction> tList = list.getList();
        return tList;   
    }
    
    public ArrayList<Supplier> supplierOrderList(){
        SupplierList list = client.target(RS_URL)
                .path("/suppliers")
                .request(MediaType.APPLICATION_JSON)
                .get(SupplierList.class);
        ArrayList<Supplier> sList = list.getList();
        return sList;   
    }
    
    public ArrayList<User> userList(){
        UserList list = client.target(RS_URL)
                .path("/users")
                .request(MediaType.APPLICATION_JSON)
                .get(UserList.class);
        ArrayList<User> userList = list.getList();
        return userList;   
    }
    
    public ArrayList<Product> productList(){
        ProdList list = client.target(RS_URL)
                .path("/products")
                .request(MediaType.APPLICATION_JSON)
                .get(ProdList.class);
        ArrayList<Product> plist = list.getList();
        return plist;
    }
    
    public HashMap billofmat(String prodname){
    BillOfMat bm = client.target(RS_URL)
                .path("/billofmat/"+ prodname)
                .request(MediaType.APPLICATION_JSON)
                .get(BillOfMat.class);
        HashMap<String, Integer> bill = bm.getMaterials();
        return bill;
    }
    
    public ArrayList<Order> orderList(){
        OrderList list = client.target(RS_URL)
                .path("/orders/finished")
                .request(MediaType.APPLICATION_JSON)
                .get(OrderList.class);
        ArrayList<Order> tList = list.getList();
        return tList;
    }
    
    public ArrayList<Stock> getStockList(){
        StockList list = client.target(RS_URL)
                .path("/stocks")
                .request(MediaType.APPLICATION_JSON)
                .get(StockList.class);
        ArrayList<Stock> sList = list.getList();
        return sList;
    }
    /*
        public void testImageUpload() throws IOException {
            final Client client = ClientBuilder.newBuilder().register(MultiPartFeature.class).build();
            final FileDataBodyPart filePart = new FileDataBodyPart("pimage", new File("D:/Untitled.png"));
            FormDataMultiPart formDataMultiPart = new FormDataMultiPart();
            final FormDataMultiPart multipart = (FormDataMultiPart) formDataMultiPart.field("pid", "200").bodyPart(filePart);
            final WebTarget target = client.target("http://192.168.1.37:8080/PanBox-1.0/webresources/panbox/upload");
            final Response response = target.request().post(Entity.entity(multipart, multipart.getMediaType()));
            formDataMultiPart.close();
            multipart.close();
        }
    */
}