import org.junit.Test;

import java.util.Iterator;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-2
 */
public class Client {

    @Test
    public void client(){
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.add("aa");
        aggregate.add("bb");
        aggregate.add("remove");
        aggregate.add("cc");
        aggregate.add("dd");
        aggregate.add("remove");
        aggregate.add("ee");

        Iterator<String> iter = aggregate.iterator();
        while (iter.hasNext()){
            String item = iter.next();
            System.out.println(item);

            if (item.equals("remove")){
                iter.remove();
            }
        }

        System.out.println("********----------********");
        for (String item : aggregate){
            System.out.println(item);
        }
    }
}
