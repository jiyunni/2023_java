class Circle0 {
   int radius;
   public Circle0(int radius) { this.radius = radius;}
   public boolean equals(Circle0 c) {
      if (radius == c.radius)
         return true;
      else
         return false;
   }
}
public class circletest {

   public static void main(String[] args) {
      Circle0 obj1 = new Circle0(10);
      Circle0 obj2 = new Circle0(10);
      
      if (obj1.equals(obj2))
         System.out.println("2개의 원은 같습니다.");
      else
         System.out.println("2개의 원은 같지 않습니다.");

   }

}