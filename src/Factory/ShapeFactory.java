package Factory;

public class ShapeFactory {
	
	  
	   public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("CIRCULO")){
	         return new Circle();
	         
	      } else if(shapeType.equalsIgnoreCase("RECTANGULO")){
	         return new Rectangle();
	         
	      } else if(shapeType.equalsIgnoreCase("CUADRADO")){
	         return new Square();
	      }
	      
	      return null;
	   }
	}