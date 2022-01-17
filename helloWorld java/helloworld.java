class HelloWorld{
    public static void main(String[] args){

       

        /*String myName;
        int myAge;
        myName = "Brian";
        myAge = 22;
       System.out.println("my Name is  " + myName + " and  i`m " + myAge + " years of age ")*/

       employee obj = new employee();
        int employee_Id = 4654;
        String firstName = "Brian";
        String lastName = "Kip";
        String status = "single";
        String address = "Karen";
        int phoneNo = 575575686;
        int netSalary = 100000;

        System.out.println(obj); 
        System.out.println(employee_Id);
        System.out.println("FirstName -------->  "+firstName); 
        System.out.println("LastName  -------->  "+lastName);
        System.out.println("status  --------->  "+status);
        System.out.println("address ------->  "+address);
        System.out.println("phoneNo  ------->  "+phoneNo); 
        System.out.println("netSalary ------>  "+netSalary); 
    }

}