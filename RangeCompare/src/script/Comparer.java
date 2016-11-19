package script;

import java.awt.Color;
import java.util.LinkedList;

public class Comparer {
	
	private LinkedList<Taxon> _taxa;
	private Cell[][] _cells;
	private int _x, _y;
	
	public Comparer(LinkedList<Taxon> taxa, int x, int y){
		_taxa = taxa;
		_x = x;
		_y = y;
		_cells = new Cell[x][y];
		for(int xIt = 0; xIt < _x; xIt++){
			for(int yIt = 0; yIt < _y; yIt++){
				_cells[xIt][yIt] = new Cell();
			}
		}
	}
	
	public Color[][] combine(){
		Color[][] img = new Color[_x][_y];
		for(Taxon t : _taxa){
			for(int xIt = 0; xIt < _x; xIt++){
				for(int yIt = 0; yIt < _y; yIt++){
					if(t.get_color().equals(t.get_img()[xIt][yIt])){
						_cells[xIt][yIt].add_taxa(t);
					}
				}
			}
		}
		return img;
	}
	
	public Cell[][] get_cells() {
		return _cells;
	}
	public void set_cells(Cell[][] _cell) {
		this._cells = _cell;
	}
	public LinkedList<Taxon> get_taxa() {
		return _taxa;
	}
	public void set_taxa(LinkedList<Taxon> _taxa) {
		this._taxa = _taxa;
	}

}
