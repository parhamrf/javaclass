public class Registration {

   private String fullname;
   private int birthday;

   public Registration (String f, int b){

       this.fullname=f;
       this.birthday=b;

       String Registrationcode = fullname+birthday;

       System.out.println(Registrationcode);

       
   }

}
