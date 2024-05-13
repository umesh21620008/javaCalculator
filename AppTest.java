class AppTest{

    public static void main(String args[]){

        App app = new App();

        if(app.add(1,33) == 35){
            System.out.println("Test Case 1 Passed");
        }else{
                System.out.println("Test Case 1 Failed");
                throw new AssertionError();
        }
    }




}
