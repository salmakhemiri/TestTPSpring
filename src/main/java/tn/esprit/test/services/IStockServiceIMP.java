package tn.esprit.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.test.entity.Stock;
import tn.esprit.test.repositories.StockRepository;

import java.util.List;

@Service
public class IStockServiceIMP implements IStockService{

    @Autowired
    StockRepository stockRepository;

    @Override
    public Stock addStock(Stock s){return stockRepository.save(s);};

    public Stock updateStock(Stock u){return stockRepository.save(u);};


    public List<Stock> retrieveAllStocks(){return null;}
    @Override
    public Stock retrieveStock(Long idStock){
        return stockRepository.findById(idStock).orElse(null);
    }

}
