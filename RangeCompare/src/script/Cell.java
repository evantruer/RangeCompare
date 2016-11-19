package script;

import java.util.LinkedList;

public class Cell {
	
	private LinkedList<Taxon> _present;
	
	public Cell(){
		set_present(new LinkedList<Taxon>());
	}

	public LinkedList<Taxon> get_present() {
		return _present;
	}

	public void set_present(LinkedList<Taxon> _present) {
		this._present = _present;
	}
	
	public void add_taxa(Taxon t){
		_present.add(t);
	}

}
