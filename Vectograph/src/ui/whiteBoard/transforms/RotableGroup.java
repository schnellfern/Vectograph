package ui.whiteBoard.transforms;

import javafx.scene.Group;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;

public class RotableGroup extends Group {
	public Rotate r;
    public Transform t = new Rotate();

    public void setXrotation(int ang) {
      r = new Rotate(ang, Rotate.X_AXIS);
      t = t.createConcatenation(r);
      this.getTransforms().clear();
      this.getTransforms().addAll(t);
    }

    public void setYrotation(int ang) {
      r = new Rotate(ang, Rotate.Y_AXIS);
      t = t.createConcatenation(r);
      this.getTransforms().clear();
      this.getTransforms().addAll(t);
    }
    public void setZrotation(int ang) {
    	r = new Rotate(ang,Rotate.Z_AXIS);
    	t = t.createConcatenation(r);
    	this.getTransforms().clear();
    	this.getTransforms().addAll(r);
    }
    
}
