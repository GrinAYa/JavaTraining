package by.epam.javatraining.hrynhlaz.maintask01.model.logic;

/**
 * Class defines objects, thats representing containers with
 * dynamically changing size 
 * 
 * @version		1.03 9 Jun 2019
 * @author 		Aliaksandr Hrynhlaz
 */
public class SimpleObjectList {
	private Object[] list = new Object[0];

	public void addItem(Object item) {
		Object[] newList = new Object[list.length + 1];
		for (int i = 0; i < list.length; i++) {
			newList[i] = list[i];
		}
		newList[newList.length - 1] = item;
		list = newList;
		newList = null;
	}
	
	public void addItem(Object item, int itemIndex) {
		if (itemIndex > list.length - 1) {
			Object[] newList = new Object[itemIndex + 1];
			for (int i = 0; i < list.length; i++) {
				newList[i] = list[i];
			}
			newList[itemIndex] = item;
			list = newList;
			newList = null;
		} else {
			list[itemIndex] = item;
		}
	}

	public void removeItem(int itemIndex) {
		if (!(list.length > 0 && itemIndex < list.length && itemIndex >= 0)) {
			return;
		}
		Object[] newList = new Object[list.length - 1];
		for (int i = 0; i < itemIndex; i++) {
			newList[i] = list[i];
		}
		for (int i = itemIndex + 1; i < list.length; i++) {
			newList[i - 1] = list[i];
		}
		list = newList;
		newList = null;
	}
	
	/**
	 * returns list length
	 * @return integer value
	 */
	public int length() {
		return list.length;
	}

	/**
	 * returns element from object list with index equal to itemIndex
	 */
	public Object get(int itemIndex) {
		if (itemIndex >= 0 && itemIndex < list.length) {
			return list[itemIndex];
		}
		return null;
	}
	
	public String toString() {
		String result = "";
		for(int i = 0; i < list.length; i++) {
			result = result + " " + list[i].toString();
		}
		return result;
	}
}
