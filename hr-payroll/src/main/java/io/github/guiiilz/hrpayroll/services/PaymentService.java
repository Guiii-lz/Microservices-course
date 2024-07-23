package io.github.guiiilz.hrpayroll.services;

import io.github.guiiilz.hrpayroll.entities.Payment;
import io.github.guiiilz.hrpayroll.entities.Worker;
import io.github.guiiilz.hrpayroll.feignClients.WorkerFeignClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClients workerFeignClients;

    public Payment getPayment(long workerId, int days) {
        Worker worker = workerFeignClients.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}


