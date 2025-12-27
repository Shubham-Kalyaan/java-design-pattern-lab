## Diagram for Strategy Design Pattern

<pre>
┌──────────────┐
│   Client     │
│ (Controller) │
│              │
│ ⭐ OBJECT    │
│ ⭐ CREATED   │
│ ⭐ HERE      │
│ new Upi()    │
│ new Card()   │
└──────┬───────┘
       │ inject strategy
       ▼
┌──────────────────────────┐
│     PaymentContext       │
│                          │
│  ❝ I do NOT create ❞     │
│  ❝ I only use it ❞       │
│                          │
└──────┬───────────────────┘
       │ delegate pay()
       ▼
┌────────────┬────────────┬───────────────-──┐
│ UPI        │ Card       │ NetBanking       │
│ Strategy   │ Strategy   │ Strategy         │
└──────┬─────┴──────-┬─────┴──────┬──────────┘
       │             │            │
       └─────────────┴────────────┘
                     ▼
                  pay(amount)
                     ▼
                  Result

</pre>