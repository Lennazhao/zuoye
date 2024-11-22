public class Example06Dog extends Example06Animal {
    private String color;

    public Example06Dog(String name, int age, String color) {
        super(name, age);
        this.setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String info () {
        return super.info() + ", 颜色: " + this.getColor();
    }
}
