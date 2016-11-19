package script;

import java.awt.Color;

public class Taxon {
	
	private String _name;
	private Color _color;
	private Color[][] _img;
	
	public Taxon(String name, Color color, Color[][] img){
		_name = name;
		_color = color;
		_img = img;
	}
	
	public Color[][] get_img() {
		return _img;
	}
	public void set_img(Color[][] _img) {
		this._img = _img;
	}
	public Color get_color() {
		return _color;
	}
	public void set_color(Color _color) {
		this._color = _color;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}

}
