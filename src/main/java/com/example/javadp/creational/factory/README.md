## Below is the diagrametic explanation of Factory Design Pattern

<pre>
┌──────────────┐
│   Client     │
│ (Controller) │
└──────┬───────┘
       │ request(type)
       ▼
┌──────────────────────────────┐
│   NotificationFactory        │
│                              │
│  ⭐ OBJECT CREATED HERE ⭐   │
│  new EmailNotification()     │
│  new SmsNotification()       │
│  new PushNotification()      │
│                              │
│  ❝ Client never uses new ❞    │
└──────┬───────────┬───────────┘
       │           │
       ▼           ▼
┌────────────┐ ┌────────────┐ ┌──────────────┐
│ Email      │ │ SMS        │ │ Push         │
│Notification│ │Notification│ │Notification  │
└──────┬─────┘ └──────┬─────┘ └──────┬───────┘
       │              │              │
       └───────┬──────┴──────┬───────┘
               ▼
           send(message)
               ▼
            Result

</pre>