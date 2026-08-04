package batch.pg.application.pg.service;

import batch.pg.api.pg.dto.PgApproveRequest;
import batch.pg.api.pg.dto.PgApproveResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

@Service
@RequiredArgsConstructor
public class PgService {

    private final AtomicLong sequence = new AtomicLong(1);

    public PgApproveResponse approve(PgApproveRequest pgApproveRequest){
        return PgApproveResponse.builder()
                .transactionId(sequence.getAndIncrement())
                .approvedAt(LocalDateTime.now())
                .paymentId(pgApproveRequest.paymentId())
                .status("SUCCESS")
                .amount(pgApproveRequest.amount())
                .build();
    }
}
