package batch.pg.application.pg.service;

import batch.pg.api.pg.dto.PgApproveRequest;
import batch.pg.api.pg.dto.PgApproveResponse;
import batch.pg.api.pg.dto.PgCancelRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

@Service
@RequiredArgsConstructor
public class PgService {

    private final AtomicLong sequence = new AtomicLong(1);

    public PgApproveResponse approve(PgApproveRequest pgApproveRequest){
        System.out.println("승인번호 : "+ pgApproveRequest.paymentId());
        System.out.println("주문번호 : "+pgApproveRequest.orderId());
        System.out.println("승인금액 : "+pgApproveRequest.amount());
        return PgApproveResponse.builder()
                .transactionId(sequence.getAndIncrement())
                .approvedAt(LocalDateTime.now())
                .paymentId(pgApproveRequest.paymentId())
                .status("SUCCESS")
                .amount(pgApproveRequest.amount())
                .build();
    }
    public void cancel(PgCancelRequest pgCancelRequest){
        System.out.println("pg번호 : "+ pgCancelRequest.transactionId()+"취소금액 : "+pgCancelRequest.amount());
    }
}
