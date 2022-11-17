package tn.esprit.test.services;

import tn.esprit.test.entity.Stock;
import java.util.List;

public interface IStockService {

    public Stock addStock(Stock s);
    public Stock updateStock(Stock u);
    public List<Stock> retrieveAllStocks();
    public Stock retrieveStock(Long idStock);
}
