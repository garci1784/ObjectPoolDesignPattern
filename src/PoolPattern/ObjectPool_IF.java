package PoolPattern;


public interface ObjectPool_IF {
    public int getSize();
    public int getCapacity();
    public void setCapacity(int c) throws IllegalArgumentException;
    public Object getObject();
    public Object waitForObject() throws InterruptedException;
    public void release(Object o);
}
