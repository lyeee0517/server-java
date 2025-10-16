package kr.hhplus.be.server.core.util.exception;

public record ErrorResponse(
    String code,
    String message
) {
}
