package interfaces;

import java.util.List;
import Classes.Plant;

public interface Cutter {
	double cutItem(Plant plant);
	double cutItems(List<Plant> plant);
}
