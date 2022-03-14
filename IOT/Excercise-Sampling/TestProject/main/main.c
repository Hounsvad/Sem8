#include <stdio.h>
#include "sdkconfig.h"
#include "freertos/FreeRTOS.h"
#include "freertos/task.h"
#include "esp_system.h"
#include "esp_spi_flash.h"
#include "driver/adc.h"

void delay(int ms)
{
    vTaskDelay(ms / portTICK_PERIOD_MS);
}

void loop(){
    while(1)
    {

        printf("This is the loop!\n");
        int x = adc1_get_raw(ADC1_CHANNEL_0);
        printf("ADC1_0: %d\n", x);
        delay(1000);
    }
}

void app_main(void)
{
    printf("Hello World\n");
    xTaskCreate(loop, "loop", 4096, NULL, 1, NULL);
}

