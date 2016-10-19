// MathLab01st.java
// The Geometry Class Program
// This is the student, starting version of the MathLab01 assignment.
// 4 Geometry class methods are provided as an example.
// You need to write the other 20 on your own.
import java.util.Scanner;


public class MathLab01st
{
	public static double side, length, width, height, base1, base2, radius;
	
	public static void main (String args[]) 						
	{   
		System.out.println("\nMathLab01\n\n");
		enterData();
		display2DPerimeters();
		display2DAreas();
		display3DSurfaceAreas();
		display3DVolumes();			
	}
	
	public static void enterData() 						
	{	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter  Side     ===>>  ");										
		side = input.nextDouble();
		System.out.print("Enter  Length   ===>>  ");										
		length = input.nextDouble();
		System.out.print("Enter  Width    ===>>  ");										
		width = input.nextDouble();
		System.out.print("Enter  Height   ===>>  ");										
		height = input.nextDouble();
		System.out.print("Enter  Base1    ===>>  ");										
		base1 = input.nextDouble();
		System.out.print("Enter  Base2    ===>>  ");										
		base2 = input.nextDouble();
		System.out.print("Enter  Radius   ===>>  ");										
		radius = input.nextDouble();
	}

// Remove comments from the println statements below as you complete each of the methods of the Geometry class.
// Leave comments in place for any methods that you have not finished.

	public static void display2DPerimeters() 						
	{	
		System.out.println("\n\nPerimeters of 2D Shapes");
		System.out.println("=====================================================");
		System.out.println("Square Perimeter:                 " + Geometry.squarePerimeter(side));
		System.out.println("Pentagon Perimeter:               " + Geometry.pentagonPerimeter(side));
		System.out.println("Hexagon Perimeter:                " + Geometry.hexagonPerimeter(side));
		System.out.println("Octagon Perimeter:                " + Geometry.octagonPerimeter(side));
		System.out.println("Rectangle Perimeter:              " + Geometry.rectanglePerimeter(length,width));
		System.out.println("Circle Perimeter (circumference): " + Geometry.circumference(radius));
		System.out.println("\n");
	}
	
	public static void display2DAreas() 						
	{	
		System.out.println("Areas of 2D Shapes");
		System.out.println("=====================================================");
		System.out.println("Square Area:                      " + Geometry.squareArea(side));
		System.out.println("Rectangle Area:                   " + Geometry.rectangleArea(length,width));
		System.out.println("Parallelogram Area:               " + Geometry.ParallelogramArea(base1,height));
		System.out.println("Triangle Area:                    " + Geometry.TriangleArea(base1,height));		
		System.out.println("Trapezoid Area:                   " + Geometry.TrapezoidArea(base1,base2,height));
		System.out.println("Hexagon Area:                     " + Geometry.hexagonArea(base1,base2,height));
		System.out.println("Circle Area:                      " + Geometry.circleArea(radius));
		System.out.println("\n");
	}



	public static void display3DSurfaceAreas() 						
	{	
		System.out.println("Surface Areas of 3D Shapes");
		System.out.println("=====================================================");
		System.out.println("Cube Surface Area:                " + Geometry.cubeSurfaceArea(side));
		System.out.println("Square Prism Surface Area:        " + Geometry.squarePrismSurfaceArea(side,height));
		System.out.println("Rectangular Prism Surface Area:   " + Geometry.rectangularPrismSurfaceArea(length,width,height));
		System.out.println("Sphere Surface Area:              " + Geometry.sphereSurfaceArea(radius));
		System.out.println("\n");
	}
	
	public static void display3DVolumes() 						
	{	
		System.out.println("Volumes of 3D Shapes");
		System.out.println("=====================================================");
		System.out.println("Cube Volume:                      " + Geometry.cubeVolume(side));
		System.out.println("Square Prism Volume:              " + Geometry.squarePrismVolume(side,height));
		System.out.println("Rectangular Prism Volume:         " + Geometry.rectangularPrismVolume(length,width,height));
		System.out.println("Pyramid Volume:                   " + Geometry.pyramidVolume(side,height));
		System.out.println("Cylinder Volume:                  " + Geometry.cylinderVolume(radius,height));
		System.out.println("Cone Volume:                      " + Geometry.coneVolume(radius,height));
//		System.out.println("Sphere Volume:                    " + Geometry.sphereVolume(radius));
		System.out.println("\n");		
	}
}


class Geometry
{
    // 2D Perimeters
	public static double squarePerimeter (double s)                      
	{ 
	    return 4 * s; 
	}
	


	public static String circumference(double radius) {
		// TODO Auto-generated method stub
		return null;
	}



	public static double rectanglePerimeter (double l,double w)

	{
		return l * 2 + w * 2 ;
	}
	
	public static double octagonPerimeter (double s)

	{
		return 8 * s ;
	}
	
	public static double pentagonPerimeter (double s)

	{
		return 5 * s ;
	}
	
	public static double hexagonPerimeter (double s)

	{
		return 6 * s ;
	}
		
	
	public static double circlePerimeter (double radius)

	{
		return 2 *Math.PI *radius ;
	}

	// 2D Areas
	public static double squareArea (double s)             
	{ 
	    return s * s; 
	}
	
	public static double rectangleArea (double l,double w)             
	{ 
	    return l* w; 
	}
	
	public static double ParallelogramArea (double b,double h)             
	{ 
	    return b * h; 
	}
	
	public static double TriangleArea (double base1,double h)             
	{ 
	    return base1 * h/2; 
	}

	public static double TrapezoidArea (double base1,double base2,double h)             
	{ 
	    return (base1 + base2) / 2 * h; 
	}

	public static double hexagonArea (double base1,double base2,double h)             
	{ 
	    return (base1 + base2)  * h; 
	}
	
	public static double circleArea (double radius)             
	{ 
	    return Math.PI*(radius*radius) ; 
	}
    // 3D Surface Areas
	public static double cubeSurfaceArea (double s)                      
	{ 
	    return 6 * s * s; 
	}
	
	public static double squarePrismSurfaceArea(double s,double h)             
	{ 
	    return  2 * (s * s) + 4 * s * h; 
	}
	
	public static double rectangularPrismSurfaceArea(double l,double h,double w)             
	{ 
	    return  2 * l * w + 2 * l * h + 2 * w * h; 
	}
	
	public static double sphereSurfaceArea(double radius)             
	{ 
	    return  4 * Math.PI * (radius * radius) ; 
	}
	
	
	
	
	// 3D Volumes
	public static double cubeVolume (double s)             
	{ 
	    return s * s * s; 
	}
	
	public static double squarePrismVolume(double s,double h)             
	{ 
	    return  (s * s) * h; 
	}
	
	public static double rectangularPrismVolume(double l,double h,double w)             
	{ 
	    return   l * w * h ; 
	}
	
	public static double pyramidVolume(double s,double h)             
	{ 
	    return  (s * s) * h / 3; 
	}
	
	public static double cylinderVolume(double radius,double h)             
	{ 
	    return  Math.PI * (radius * radius) * h; 
	}
	
	public static double coneVolume(double radius,double h)             
	{ 
	    return  Math.PI * (radius * radius) * h / 3; 
	}
	
	public static double sphereVolume(double radius)             
	{ 
	    return 4 * Math.PI * (radius * radius * radius) / 3; 
	}
	
}
