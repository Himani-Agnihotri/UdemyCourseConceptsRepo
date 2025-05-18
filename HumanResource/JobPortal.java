package HumanResource;

import SalesDepartment.Invoice;

/*public class JobPortal {
    public void getInvoiceForJobPortal(){
        Invoice invoiceObj = new Invoice();
        //invoiceObj.getInvoice(); Cannot access PVT Method
        //invoiceObj.getInvoice(); Cannot access PROTECTED METHOD
    }
}*/
public class JobPortal extends Invoice {
    public void getInvoiceForJobPortal(){
        //Invoice invoiceObj = new Invoice();
        //invoiceObj.getInvoice();
        //invoiceObj.getInvoice(); Cannot access PROTECTED METHOD
        getInvoice(); // because it is child now so able to access protected method
    }
}