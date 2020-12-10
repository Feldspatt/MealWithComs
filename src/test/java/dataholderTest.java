import org.junit.Test;
import org.mealwith.Tool.DataHolder;

import java.util.ArrayList;

public class dataholderTest {
    @Test
    public void setListTest(){
        int i = 2;
        ArrayList<Object> liste = new ArrayList<>();
        liste.add(i);

        System.out.print("liste size: " + liste.size());

        DataHolder.getINSTANCE().setList(liste);
        System.out.print("list size: " + DataHolder.getINSTANCE().getList().size());
    }
}
