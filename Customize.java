import java.awt.Color;

public class Customize {

      public static void main(String[] args) {
          int grayPixel = Integer.parseInt(args[0]);
          Picture picture = new Picture("Portrait.jpg");

          for(int column = 0 ; column < picture.width(); column++) {
              for(int row = 0; row < picture.height(); row++) {
                  Color pixelColor = picture.get(column, row);
                  int gray = pixelColor.getRed();
                  Color newpixelColor = new Color(gray, gray, gray);
                  StdDraw.setXscale(0, picture.width());
                  StdDraw.setYscale(0, picture.height());

                  if(gray <= grayPixel){
                    StdDraw.point(column, row);
                  }

                  // bei Grau müssen alle Farbanteile gleichwertig sein
                  // 255 bei Rot, grün, blau ergibt schwarz, 0 bei Rot, Grün, Blau ergibt weiß
                  System.out.println(column + " x " + row + " : " + gray);
                  picture.set(column, row, newpixelColor);
              }
          }

          picture.show();


      }
  }
