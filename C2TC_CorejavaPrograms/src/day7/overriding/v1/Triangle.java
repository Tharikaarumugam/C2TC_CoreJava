package day7.overriding.v1;

public class Triangle extends Shape {
	private double base;
	private double height;

	
	    
	    public Triangle(double base, double height) {
	        this.base = base;
	        this.height = height;
	    }
	    
	    // ✅ CORRECT: This will work now
	    @Override
	    public void draw() {
	        System.out.println("Drawing a triangle with base " + base + " and height " + height);
	    }
	    
	    @Override
	    public void erase() {
	        System.out.println("Erasing a triangle with base " + base + " and height " + height);
	    }
	}

	// Alternative: If you don't want to override, remove @Override
	class TriangleWithoutOverride extends Shape {
	    private double base;
	    private double height;
	    
	    public TriangleWithoutOverride(double base, double height) {
	        this.base = base;
	        this.height = height;
	    }
	    
	    // ✅ CORRECT: No @Override annotation, so it's a new method
	    public void draw() {
	        System.out.println("Drawing a triangle with base " + base + " and height " + height);
	    }
	}
