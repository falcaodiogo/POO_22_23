import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StorageService implements StorageServiceInterface {

    private String name;
    private String endereco;
    private ArrayList <Client> clients;
    private ArrayList <Rental> rentals;
    private ArrayList <StorageUnit> storageUnits;

    public StorageService(String name, String endereco) {
        this.name = name;
        this.endereco = endereco;
        this.clients = new ArrayList<>();
        this.storageUnits = new ArrayList<>();
        this.rentals = new ArrayList<>();
    }

    @Override
    public boolean registerClient(int taxId, String name, ClientType type) {
        Client client = new Client(taxId, name, type);
        if (clients.contains(client)) {
            return false;
        }
        clients.add(client);
        return true;
    }

    @Override
    public Client getClient(int taxId) {
        for (Client client : clients) {
            if (client.getNumContribuinte() == taxId) {
                return client;
            }
        }
        return null;
    }

    @Override
    public void addStorageUnit(StorageUnit storageUnit) {
        storageUnits.add(storageUnit);
    }

    @Override
    public void addStorageUnits(Collection<StorageUnit> storageUnits) {
        this.storageUnits.addAll(storageUnits);
    }

    @Override
    public boolean checkAvailability(StorageUnit storageUnit, LocalDate startDate, LocalDate endDate) {
        for (Rental rental : rentals) {
            if (rental.getAluguer().equals(storageUnit)) {
                if (rental.getDataInicial().isBefore(startDate) && rental.getDataFinal().isAfter(startDate)) {
                    return false;
                }
                if (rental.getDataInicial().isBefore(endDate) && rental.getDataFinal().isAfter(endDate)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public List<StorageUnit> findAvailableUnits(Type unitType, LocalDate fromDate, int duration, int[] minDimensions) {
        ArrayList<StorageUnit> availableUnits = new ArrayList<>();
        for (StorageUnit storageUnit : storageUnits) {
            if (storageUnit.getType().equals(unitType) && storageUnit.getDimensoes()[0] >= minDimensions[0] && storageUnit.getDimensoes()[1] >= minDimensions[1]) {
                if (checkAvailability(storageUnit, fromDate, fromDate.plusDays(duration))) {
                    availableUnits.add(storageUnit);
                }
            }
        }
        return availableUnits;
    }

    @Override
    public boolean rentStorageUnit(Client client, StorageUnit unit, LocalDate startDate, int duration) {
        if (checkAvailability(unit, startDate, startDate.plusDays(duration))) {
            LocalDate endDate = startDate.plusDays(duration);
            rentals.add(new Rental(unit, startDate, endDate));
            return true;
        }
        return false;
    }

    @Override
    public double calculateTotalCost(StorageUnit unit, int duration) {
        return unit.getPrecoDia() * duration;
    }

    @Override
    public List<String> listRentals() {
        ArrayList<String> rentalsList = new ArrayList<>();
        for (Rental rental : rentals) {
            rentalsList.add(rental.toString());
        }
        return rentalsList;
    }

    @Override
    public List<String> listRentals(Type unitType) {
        ArrayList<String> rentalsList = new ArrayList<>();
        for (Rental rental : rentals) {
            if (rental.getAluguer().getType().equals(unitType)) {
                rentalsList.add(rental.toString());
            }
        }
        return rentalsList;
    }

    @Override
    public String toString() {
        return "StorageService";
    }

    public Iterable<StorageUnit> getAvailableUnitsBySize(LocalDate of, int i) {
        for (StorageUnit storageUnit : storageUnits) {
            if (storageUnit.getDimensoes()[0] >= i) {
                if (checkAvailability(storageUnit, of, of.plusDays(1))) {
                    return storageUnits;
                }
            }
        }
        return storageUnits;
    }

    
    
}
