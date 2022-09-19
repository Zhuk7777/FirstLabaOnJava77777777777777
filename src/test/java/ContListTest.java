import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContListTest {

    @Test
    void getSize() {
        ContList obj=new ContList();
        for(int i=0;i<3;i++)
        {
            obj.contInsert(2);
        }
        assertEquals(3,obj.getSize());
    }

    @Test
    void contInsert() {
        ContList obj=new ContList();
        obj.contInsert(3);
        obj.contInsert(2);

        assertEquals(2,obj.contExtract(1));
    }

    @Test
    void contExtract() {
        ContList obj=new ContList();
        obj.contInsert(2);

        assertEquals(2,obj.contExtract(0));
    }

    @Test
    void contDelete() {
        ContList obj=new ContList();
        obj.contInsert(3);
        obj.contInsert(2);
        obj.contInsert(1);

        obj.contDelete(1);
        assertEquals(1,obj.contExtract(1));
    }
}