


import org.junit.Test;
import static org.junit.Assert.*;

import vn.poly.sof304.sonphph05134.*;


public class testGiaiPtBac2 {
    giaiptbac2 giaipt = new giaiptbac2();

//    @Test
//    public void testTp1(){
//        String ex="Phương trình vô nghiệm";
//        assertEquals(ex,giaiptbac2.giaiPTBac2(1,6,2));
//        System.out.println("End test");
//    }
//    @Test
//    public void testTp2(){
//        String ex ="Phương trình có 2 nghiệm là: "
//                + "x1 = " + " và x2 = ";
//        assertEquals(ex,giaiptbac2.giaiPTBac2(1,6,2));
//        System.out.println("End test");
//    }
    @Test
    public void testTp3(){
        String ex="Phương trình có vô số nghiệm";
        assertEquals(ex,giaiptbac2.giaiPTBac2(0,0,0));
    }
}
