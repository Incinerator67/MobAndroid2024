package com.company.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {
    private String mOwner;
    private boolean mPool;

    public House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        mOwner = null;
        mPool = false;
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner) {
        super(length, width, lotLength, lotWidth);
        mOwner = owner;
        mPool = false;
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
        super(length, width, lotLength, lotWidth);
        mOwner = owner;
        mPool = pool;
    }

    public String getOwner() {return mOwner;}
    public void setOwner(String owner) {mOwner = owner;}

    public boolean hasPool() {return mPool;}
    public void setPool(boolean pool) {mPool = pool;}

    @Override
    public String toString() {
        StringBuilder houseString = new StringBuilder("Owner: ");
        if (mOwner != null) {houseString.append(mOwner);}

        if (calcLotArea() > calcBuildingArea()) {houseString.append("; has a big open space");}

        return houseString.toString();
    }

    @Override
    public boolean equals(Object obj) {
        //совпадает ли ссылка на сравниваемый объект (obj) с текущим экземпляром (this)
        if (this == obj) return true;

        if (!(obj instanceof House)) return false;
        //obj преобразуется в объект House
        House otherHouse = (House) obj;

        return super.calcBuildingArea() == otherHouse.calcBuildingArea() && this.mPool == otherHouse.mPool;
    }
}
