import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.providers.Microsoft;
import de.fhpotsdam.unfolding.providers.Yahoo;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class earthquake extends PApplet{
private UnfoldingMap map;
   
  public void setup(){
	   size(950,600,OPENGL);
	   map=new UnfoldingMap(this,50,50,700,500,new Microsoft.RoadProvider());
	   map.zoomToLevel(2);
	   MapUtils.createDefaultEventDispatcher(this, map);
   }
   public void draw(){
	   background(0);
	   map.draw();
   }
}
