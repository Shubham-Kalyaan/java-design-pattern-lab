## Decorator Design Pattern

    Decorator wraps behavior layer by layer without changing the original code.

---

    Strategy  → WHAT to do
    Decorator → HOW MUCH extra to do

---

### Structure

<pre>
┌──────────────────────────────┐
│          CLIENT              │
│ (Controller / Application)   │
└──────────────┬───────────────┘
               │
               │ creates strategy
               ▼
┌──────────────────────────────┐
│       PaymentStrategy        │   ◀── Strategy Pattern
│  (UPI / CARD / NET logic)    │
└──────────────┬───────────────┘
               │
               │ adapted to be decoratable
               ▼
┌──────────────────────────────┐
│   StrategyPaymentAdapter     │   ◀── Adapter (Glue)
│  (implements Payment)       │
└──────────────┬───────────────┘
               │
               │ wrapped by decorators
               ▼
┌──────────────────────────────┐
│     LoggingDecorator         │
│   (+ logging behavior)       │
└──────────────┬───────────────┘
               │
               ▼
┌──────────────────────────────┐
│     RetryDecorator           │
│   (+ retry behavior)         │
└──────────────┬───────────────┘
               │
               ▼
┌──────────────────────────────┐
│     AuditDecorator           │
│   (+ audit behavior)         │
└──────────────┬───────────────┘
               │
               ▼
        pay(amount) → RESULT
</pre>

---
### Run Time Execution Flow
<pre>
Client
  ↓
AuditDecorator
  ↓
RetryDecorator
  ↓
LoggingDecorator
  ↓
StrategyPaymentAdapter
  ↓
PaymentStrategy (UPI / CARD / NET)
</pre>

### Why Each Block Exists
| Block                   | Why it exists            |
| ----------------------- | ------------------------ |
| PaymentStrategy         | Core business algorithm  |
| StrategyPaymentAdapter  | Makes strategy wrappable |
| PaymentDecorator        | Base wrapper abstraction |
| Logging / Retry / Audit | Extra behavior           |
| Client                  | Chooses what & how much  |
