public class Builder {

    private Product product = new Product();

    public void build1(){
        product.setPart1("Part 1");
    }
    public void build2(){
        product.setPart2("Part 2");
    }
    public void build3(){
        product.setPart3("Part 3");
    }

    public Product product(){
        return product;
    }

}
