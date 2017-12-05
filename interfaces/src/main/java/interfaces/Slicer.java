package interfaces;

import java.util.List;
import Classes.Plant;

public interface Slicer {
	double sliceItem(Plant plant);
	double sliceItems(List<Plant> list);
}
