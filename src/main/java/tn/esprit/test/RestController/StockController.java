package tn.esprit.test.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.test.entity.Stock;
import tn.esprit.test.services.IStockService;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {
        @Autowired
        IStockService stockService;

        @GetMapping("/retrieveAllStocks")
        public List<Stock> retrieveAllStocks()
        {
            return stockService.retrieveAllStocks();
        }

        @PostMapping("/addStock")
        public Stock addStock(@RequestBody Stock s )
        {
            return stockService.addStock(s) ;
        }


        @PutMapping("/updateStock")
        public Stock updateStock(@RequestBody Stock u)
        {
            return stockService.updateStock(u);
        }



        @GetMapping("/retrieveStock")
        public Stock retrieveStock(@PathVariable Long idStock){
            return stockService.retrieveStock(idStock);
        }
    }


