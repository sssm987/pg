package batch.pg.api.pg.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record PgApproveResponse(
        @Schema(description = "승인 번호", example = "1", hidden = false)
        Long transactionId,
        @Schema(description = "결제 번호", example = "1", hidden = false)
        long paymentId,
        @Schema(description = "결제 금액", example = "1000", hidden = false)
        long amount,
        @Schema(description = "결제 상태", example = "1", hidden = false)
        String status,
        @Schema(description = "요청 시간", example = "2026-08-22T10:23:13", hidden = false)
        LocalDateTime approvedAt,
        @Schema(description = "실패 코드", example = "1", hidden = false)
        String failureCode,
        @Schema(description = "실패 메세지", example = "1", hidden = false)
        String failureMessage
) {
}
