abstract class Beverage{
    private void pour(int qty)
    {
       System.out.println("Pour "+qty+"ml of beverage");
    }
    protected abstract void addCondiment();
   protected  void stir(){} // Declaring it as private result in no inheritance and in whisky class if this method is defined with an acesss 
   // specifier as protected then it will be a complete new method and will not be called in main method as main is an outside class.
    private void serve()
    {
        System.out.println("Serve through waiter");
    }
    void templateMethod(int qty)
    {
        pour(qty);
        addCondiment();
        stir();
        serve();
        
    }
}