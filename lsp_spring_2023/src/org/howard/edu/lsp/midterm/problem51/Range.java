package org.howard.edu.lsp.midterm;

public interface Range {
    public boolean contains(int value);
    public boolean overlaps(Range other) throws EmptyRangeException;
    public int size();
	public int getLower();
	public int getUpper();
}