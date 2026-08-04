package batch.pg.api.pg.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public record PgApproveRequest(
        @Schema(description = "승인 번호", example = "1", hidden = false)
        long paymentId,
        @Schema(description = "주문 번호", example = "1", hidden = false)
        long orderId,
        @Schema(description = "결제 금액", example = "1000", hidden = false)
        long amount
) {
}
