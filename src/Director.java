public class Director {

    private Builder builder;

    public void setBuilder(Builder builder){
        this.builder = builder;
    }


    public Product construct(){
        builder.build1();
        builder.build2();
        builder.build3();
        return builder.product();
    }



}
