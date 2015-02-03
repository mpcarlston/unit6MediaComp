/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testSepia()
  {
      Picture beach = new Picture("beach.jpg");
      beach.sepia();
      beach.explore();
    }
  public static void testSunset()
  {
      Picture beach = new Picture("beach.jpg");
      beach.sunset();
      beach.explore();
  }
  public static void testKeepOnlyBlue()
  {
      Picture canvas = new Picture("beach.jpg");
      canvas.keepOnlyBlue();
      canvas.explore();
  }
  public static void testNegate()
  {
      Picture canvas = new Picture("beach.jpg");
      canvas.negate();
      canvas.explore();
    }
  public static void testGrayscale()
  {
      Picture canvas = new Picture("beach.jpg");
      canvas.grayscale();
      canvas.explore();
  }
  public static void testFixUnderwater()
  {
      Picture canvas = new Picture("water.jpg");
      canvas.fixUnderwater();
      canvas.explore();
    }
  public static void testMirrorRightToLeft()
  {
      Picture canvas = new Picture("beach.jpg");
      canvas.mirrorVerticalRightToLeft();
      canvas.explore();
    }
  public static void testMirrorHorizontal()
  {
      Picture canvas = new Picture("swan.jpg");
      canvas.mirrorHorizontal();
      canvas.explore(); 
  }
  public static void testCopy()
  {
      Picture canvas = new Picture("beach.jpg");
      Picture swan = new Picture("swan");
      swan.copy(swan,0,0,10,10);
      swan.explore();
  }
  public static void testMirrorDiagonal()
  {
      Picture canvas = new Picture("beach.jpg");
      canvas.mirrorDiagonal();
      canvas.explore();
    }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}