package aula09;

import java.util.*;

public class PlaneManager {

    private ArrayList<Plane> PlaneList = new ArrayList<Plane>();

    private static int maxSpeed = 0;
    private static String planeid;

    public void addPlane(Plane plane) {
        PlaneList.add(plane);
        System.out.println("Plane added!");
    }

    public void removePlane(String id) {
        for (Plane p : PlaneList) {
            if (p.getId() == id) {
                PlaneList.remove(p);
                System.out.println("Plane removed!");
            }
        }
    }

    public Plane searchPlane(String id) {
        for (Plane p : PlaneList) {
            if (p.getId() == id) {
                return p;
            }
        }
        System.out.println("Erro, avião não existe");
        return null;
    }

    public void getCommercialPlanes() {
        for (Plane p : PlaneList) {
            if (p instanceof CommercialPlane) {
                    System.out.println(p);
                }
        }
    }

    public void getMilitarPlanes() {
        for (Plane p : PlaneList) {
            if (p instanceof MilitarPlane) {
                    System.out.println(p);
                }
        }
    }

    public void printAllPlanes() {
        for (Plane p : PlaneList) {
            System.out.println(p);
        }
    }

    public void getFastestPlane() {
        for (Plane p : PlaneList) {
            if (p.getMaxSpeed() >= maxSpeed) {
                planeid = p.getId();
                maxSpeed = p.getMaxSpeed();
            }
        }
        Plane max = searchPlane(planeid);
        System.out.println(max);
    }
    
}
