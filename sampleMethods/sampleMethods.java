package sampleMethods;

public class sampleMethods {
    public void printNames(String Name){
        System.out.println(Name+" Is my name "+ " and i am");
    }
    
    private String status;

    public void setStatus(String single){
        status = "single";
    }

    public String getStatus(){
        return status;
    }
}

class Demo{
    public static void main(String[] args) {
        sampleMethods SampleMethods = new sampleMethods();
        SampleMethods.printNames("Brian" );
        // SampleMethods.printNames("Curtis");
        // SampleMethods.printNames("Travis");
        // SampleMethods.printNames("Venesa");
        // SampleMethods.printNames("cynthia");
        // SampleMethods.printNames("Rayan");
        // SampleMethods.printNames("Vivian");
        // SampleMethods.printNames("Elkanah");


        SampleMethods.setStatus("single");//calling the setStatus method.
        System.out.println(SampleMethods.getStatus());
    }
}