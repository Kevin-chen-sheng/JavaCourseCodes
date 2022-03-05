package com.example.demo.week08.fenku01.xa02;

import io.shardingsphere.transaction.api.TransactionType;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年03月05日 18:34
 */
public final class TransactionTypeHolder {

    private static final ThreadLocal<TransactionType> CONTEXT = new ThreadLocal<TransactionType>() {

        @Override
        protected TransactionType initialValue() {
            return TransactionType.LOCAL;
        }
    };

    /**
     * Get transaction type for current thread.
     *
     * @return transaction type
     */
    public static TransactionType get() {
        return CONTEXT.get();
    }

    /**
     * Set transaction type for current thread.
     *
     * @param transactionType transaction type
     */
    public static void set(final TransactionType transactionType) {
        CONTEXT.set(transactionType);
    }

    /**
     * Clear transaction type for current thread.
     */
    public static void clear() {
        CONTEXT.remove();
    }
}

