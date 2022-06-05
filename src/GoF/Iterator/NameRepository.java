package GoF.Iterator;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 9:50
 * @Version 1.0
 */

/**
 * 迭代器模式：提供一种方法顺序访问对象的各个元素
 * 优点：
 *      支持不同的方式遍历对象
 *      迭代器简化了聚合类
 *      在同一个聚合类上可以有多个遍历
 *      增加新的聚合类和迭代器类都方便
 * 缺点：
 *      增加的类成对增加，提高了系统的复杂性
 */

public class NameRepository implements Container {
    public String[] names = {"Robert","John","Julie","Lora"};

    @Override
    public Iterator getInterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{

        int index;
        @Override
        public boolean hasNext() {
            if (index < names.length)
                return true;
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
