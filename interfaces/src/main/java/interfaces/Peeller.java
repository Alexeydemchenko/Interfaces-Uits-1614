package interfaces;

import java.util.List;
import Classes.Plant;

public interface Peeller {
	double peellItem(Plant plant);
	double peellItems(List<Plant> list);
}
