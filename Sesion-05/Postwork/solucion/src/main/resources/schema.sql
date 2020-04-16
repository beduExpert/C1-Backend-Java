CREATE TABLE IF NOT EXISTS transaccion (
    id BIGINT,
    price VARCHAR(255),
    qty VARCHAR(255),
    quoteQty VARCHAR(255),
    time BIGINT,
    isBuyerMaker BOOLEAN,
    isBestMatch BOOLEAN
);