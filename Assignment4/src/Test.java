public class Test {
    public static void main(String[] args){
        //find the kth largest number
        int[] nums={3,2,1,5,6,4};
        KthLargest kthLargest=new KthLargest();
        kthLargest.findKthLargest(nums,2);
        int[] nums2={3,2,3,1,2,4,5,5,6};
        kthLargest.findKthLargest(nums2,4);

        //Constructed a Circle with Circle()
        //Run of the program should produce the following output:
        //Radius is 2.0, Color is yellow, Base area is (your answer)
        Circle circle=new Circle(2.0,"Yellow");
        System.out.println(circle.toString()+ "Base area is "+circle.getArea());

        //Constructed a Cylinder with Cylinder()
        //Run of the program should produce the following output:
        //Radius is 1.0, Height is 1.0, Color is red, Base area is (your answer), Volume is (your answer)
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder.toString()+"Volume is "+ cylinder.getVolume()+".");
        System.out.println("Area is "+ cylinder.getArea()+".");

        //Constructed a Cylinder with Cylinder(height, radius)
        //Run of the program should produce the following output:
        //Radius is 2.0, Height is 5.0, Color is red, Base area is (your answer), Volume is (your answer)
        Cylinder cylinder2=new Cylinder(5,2.0,"red");
        System.out.println(cylinder.toString()+"Volume is "+ cylinder2.getVolume()+".");
        System.out.println("Area is "+ cylinder2.getArea()+".");



    }
}
