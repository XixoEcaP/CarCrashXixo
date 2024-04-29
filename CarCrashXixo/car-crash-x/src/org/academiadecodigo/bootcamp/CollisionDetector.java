package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.car.Car;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;

public class CollisionDetector {

    private Car[] cars;

    private Car pCar;

    public CollisionDetector(Car[] cars) {
        this.cars = cars;
        pCar = cars[cars.length-1];
    }

    public boolean isUnSafe(GridPosition pos) {

        for (Car c : cars) {

            if (c.getPos()!= pos && c.getPos().equals(pos)) {
                return true;
            }

        }

        return false;

    }

    /**
     * Checks for collisions with specific car
     * Requires iterating the array once
     * @param car
     */
    public void check(Car car) {

        for (Car ic : cars) {


            // No point in checking collisions with self
            if (ic == car ) {
                continue;
            }

            if (ic.getPos().equals(car.getPos())) {

                if (ic instanceof org.academiadecodigo.bootcamp.car.PlayerCar){

                  car.unCrash();
                  car.move();

                }
                else{                                                                            {
                ic.crash();
                car.crash();
            }}
        }

    }    }

}
