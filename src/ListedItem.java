public abstract class ListItem {
    // write code here

    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public abstract void next();
    public abstract void setNext();
    public abstract void previous();
    public abstract void setPrevious();
    private void compareTo();


}
