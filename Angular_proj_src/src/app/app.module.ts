import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module'; // ✅ Import AppRoutingModule
import { AnimeListComponent } from '../components/anime-list/anime-list.component';
import { AnimeDetailComponent } from '../components/anime-detail/anime-detail.component';
import { EnquiryFormComponent } from '../components/enquiry-form/enquiry-form.component';

@NgModule({
  
  imports: [
    BrowserModule,
    AppRoutingModule, // ✅ Ensure AppRoutingModule is included
    FormsModule,
    AppComponent,
    AnimeListComponent,
    AnimeDetailComponent,
    EnquiryFormComponent
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
